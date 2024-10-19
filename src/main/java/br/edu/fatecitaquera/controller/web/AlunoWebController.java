package br.edu.fatecitaquera.controller.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.fatecitaquera.models.entity.Aluno;
import br.edu.fatecitaquera.models.repository.AlunoRepository;

@Controller
@RequestMapping("/alunos")
public class AlunoWebController {
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	@GetMapping("/administracao")
	public String administracao() {
		return "administracao";
	}
	
	@GetMapping("/sobre")
	public String sobre() {
		return "sobre";
	}
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@GetMapping("/list")
	public String listAll(Model model) {
		List<Aluno> aluno = alunoRepository.findAll();
		model.addAttribute("alunos", aluno);
		return "list";
	}
	
	@GetMapping("/{id}")
	public String getById(Model model, @PathVariable Integer id) {
		Optional<Aluno> aluno = alunoRepository.findById(id);
		model.addAttribute("alunos", aluno.get());		
		return "read";
	}
	
	@GetMapping("/new")
	public String newAluno(Model model) {
		model
			.addAttribute("aluno", new Aluno())
			.addAttribute("novo", true);
		return "form";
	}
	
	@PostMapping("/save")
	public String saveAluno(@ModelAttribute Aluno aluno) {
		alunoRepository.save(aluno);
		return "redirect:/alunos/list";
	}
	
	@GetMapping("/{id}/edit")
	public String editCliente(Model model, @PathVariable Integer id) {
	    Aluno aluno = alunoRepository.findById(id).get();
	    
	    model
	        .addAttribute("aluno", aluno)
	        .addAttribute("novo", false);
	    return "form";
	}

	
	@GetMapping("/{id}/delete")
	public String deleteCliente(@PathVariable Integer id) {
		Optional<Aluno> alunoDelete = alunoRepository.findById(id);
		if (alunoDelete.isPresent()) 
			alunoRepository.deleteById(id);
		
		return "redirect:/alunos/list";
	}

}
