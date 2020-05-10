package ma.tad.test.offreService.services;

import ma.tad.test.offreService.entities.Offre;

import java.util.List;

public interface IOffreService {

    public Offre saveOffre(Offre offre);

    public List<Offre> findAll();

    public Offre findOne(Long id);
}
