package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Reposetories.TrainRepositories;
import com.example.demo.entity.Train;
@Service
public class TrainServices implements Services{
	@Autowired
	TrainRepositories tr;
	@Override
	public String update(Train t) {
		tr.save(t);
		return "objected is updated";
	}

	@Override
	public List<Train> Display() {
		// TODO Auto-generated method stub
		return tr.findAll();
	}

	@Override
	public String delete(String train_number) {
		// TODO Auto-generated method stub
		tr.deleteById(train_number);
		return "responce";
	}

	@Override
	public String create(Train t) {
		// TODO Auto-generated method stub
		tr.save(t);
		return "objected is created";
	}
}
