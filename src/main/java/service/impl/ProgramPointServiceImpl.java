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

import java.util.List;

@Service
public class ProgramPointServiceImpl implements ProgramPointService {

    private static final Logger logger = LoggerFactory.getLogger(ProgramPointService.class);
    private ProgramPointDao programPointDao;

    @Autowired
    public ProgramPointServiceImpl(@Qualifier ("h2") ProgramPointDao programPointDao){ this.programPointDao=programPointDao; }


    @Override
    public List<ProgramPoint> getAllProgramPoints() {
        return null;
    }
}
