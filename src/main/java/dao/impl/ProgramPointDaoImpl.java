package dao.impl;

import dao.daoInter.ProgramPointDao;
import dao.repos.ProgramPointRepository;
import model.ProgramPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import service.impl.ProgramPointServiceImpl;

import java.util.Iterator;
@Repository
@Qualifier("h2")

public class ProgramPointDaoImpl implements ProgramPointDao {

    private static final Logger logger= LoggerFactory.getLogger(ProgramPointServiceImpl.class);
    private ProgramPointRepository programPointRepository;

    @Autowired
    public ProgramPointDaoImpl(ProgramPointRepository programPointRepository){
        this.programPointRepository = programPointRepository;
    }

    @Override
    public Iterator<ProgramPoint> showAllProgramPoints() {
        return null;
    }

    @Override
    public ProgramPoint findProgramPointByTitle() {
        return null;
    }

    @Override
    public boolean saveProgramPoint(ProgramPoint programPoint) {
        logger.debug("saveProgramPoinr(), programPoint: {}", programPoint);

        programPointRepository.save(programPoint);
        return true;
    }

    @Override
    public boolean deleteProgramPoint(Long id) {
        logger.debug("deleteProgramPoinr(), id{}", id);

        programPointRepository.deleteById(id);
        return true;
    }
}
