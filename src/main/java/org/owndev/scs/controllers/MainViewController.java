package org.owndev.scs.controllers;

import org.owndev.scs.entity.Teacher;
import org.owndev.scs.service.ObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import java.sql.SQLException;
import java.util.List;

@RestController
public class MainViewController {

	@Autowired
	@Qualifier("teacherService")
	private ObjectService<Long, Teacher> service;

	@RequestMapping(value = "/object/", method = RequestMethod.GET)
	public ResponseEntity<List<Teacher>> getAllObjects() throws SQLException {

		List<Teacher> objects = service.getAll();
		if (objects.isEmpty()) {
			return new ResponseEntity<List<Teacher>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Teacher>>(objects, HttpStatus.OK);
	}

	@RequestMapping(value = "/object/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Teacher> getObjectById(@PathVariable("id") long id) throws SQLException {
		Teacher object = service.findById(id);

		if (object == null) {
			return new ResponseEntity<Teacher>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<Teacher>(object, HttpStatus.OK);
	}
}
