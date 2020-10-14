package MainApplication.Repositories;

import MainApplication.entities.Alumno;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends BaseRepository<Alumno,Long> {
}
