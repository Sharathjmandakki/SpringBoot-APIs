package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Reposetories.TrainRepositories;
import com.example.demo.Services.TrainServices;
import com.example.demo.entity.Train;
@Controller
@RequestMapping
public class TrainController {
	@Autowired
	TrainServices ts;
	@GetMapping("form")
	public String f() {
		return "create";	
	}
	@GetMapping("dform")
	public String df() {
		return "delete";	
	}
	@GetMapping("uform")
	public String uf() {
		return "update";	
	}
	@PostMapping("create")
	public String create(Train t) {
		ts.create(t);
		return "responce";
	}
	@PostMapping("update")
	public String update(Train t) {
		ts.update(t);
		return "responce";
	}
	@GetMapping("display")
	public String Display(Model modle) {
		// TODO Auto-generated method stub
		modle.addAttribute("display", ts.Display());
		return "display";
	}
	@PostMapping("delete")
	public String delete(@ModelAttribute String train_number) {
		// TODO Auto-generated method stub
		return ts.delete(train_number);
	}
}
