package ma.tad.test.offreService.services;

import ma.tad.test.offreService.entities.Offre;
import ma.tad.test.offreService.repositories.OffreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OffreService implements IOffreService {

    private final OffreRepository offreRepository;

    public OffreService(OffreRepository offreRepository) {
        this.offreRepository = offreRepository;
    }

    @Override
    public Offre saveOffre(Offre offre) {
        return offreRepository.save(offre);
    }

    @Override
    public List<Offre> findAll() {
        return offreRepository.findAll();
    }

    @Override
    public Offre findOne(Long id) {
        return offreRepository.getOne(id);
    }
}
