package MainApplication.Services;

import MainApplication.Repositories.AlumnoRepository;
import MainApplication.Repositories.BaseRepository;
import MainApplication.entities.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoServiceImp extends BaseServiceImpl <Alumno, Long> implements AlumnoService {
    @Autowired
    private AlumnoRepository alumnoRepository;

    public AlumnoServiceImp(BaseRepository<Alumno, Long> baseRepository){

        super(baseRepository);
    }
}
