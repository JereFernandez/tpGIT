package MainApplication.controllers;

import MainApplication.Services.AlumnoServiceImp;
import MainApplication.entities.Alumno;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/alumnos")
public class AlumnoController extends BaseControllerImpl<Alumno, AlumnoServiceImp>{
}
