package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {

		
		DepartmentDAO departmentDAO = DaoFactory.createDepartmentDao();
		
		Department department = new Department(null, "Casa");
		System.out.println("=== Test 1 : Department Insert === ");
		departmentDAO.insert(department);
		System.out.println("departamento inserido");
		
		System.out.println("=== Test 2 : Department Find by ID === ");
		
		Integer departmentId = 1;
		
		Department dpt = departmentDAO.findById(departmentId);
		
		System.out.println(dpt);
		
		System.out.println("=== Test 2 : Department Find ALL === ");
		
		
		List<Department> list = departmentDAO.findAll();
		
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		
		
		departmentDAO.deleteById(12);
		


	}

}
