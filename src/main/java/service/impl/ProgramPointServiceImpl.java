package service.impl;

import dao.daoInter.ProgramPointDao;
import model.Event;
import model.ProgramPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import service.ProgramPointService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ProgramPointServiceImpl implements ProgramPointService {

    private static final Logger logger = LoggerFactory.getLogger(ProgramPointService.class);
    private ProgramPointDao programPointDao;

    @Autowired
    public ProgramPointServiceImpl(@Qualifier ("h2") ProgramPointDao programPointDao){ this.programPointDao=programPointDao; }


    @Override
    public List<ProgramPoint> getAllProgramPoints() {
        logger.debug("getAllProgramPoints()");

        List<ProgramPoint> result = new ArrayList<>();
        Iterator<ProgramPoint> programPointIterator = programPointDao.showAllProgramPoints();

        while(programPointIterator.hasNext()){
            result.add(programPointIterator.next());
        }

        return result;
    }

    @Override
    public List<ProgramPoint> getProgramPointsOfUser(String login) {
        return null;
    }

    @Override
    public List<ProgramPoint> getProgramPointsFromEvent(String eventTitle) {
        return null;
    }

    @Override
    public List<ProgramPoint> getProgramPointsOfType(String type) {
        return null;
    }

    @Override
    public boolean saveProgramPoint(ProgramPoint newProgramPoint) {
        logger.debug("saveProgramPoint()");

        return programPointDao.saveProgramPoint(newProgramPoint);
    }

    @Override
    public boolean deleteProgramPoint(Long id) {
        logger.debug("deleteProgramPoint()");

        return programPointDao.deleteProgramPoint(id);

    }
}
