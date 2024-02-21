package com.example.demo.Services;
import com.example.demo.entity.*;
import java.util.*;
public interface Services {
	public String create(Train t);
	public String update(Train t);
	public List<Train> Display();
	public String delete(String train_number);
}
