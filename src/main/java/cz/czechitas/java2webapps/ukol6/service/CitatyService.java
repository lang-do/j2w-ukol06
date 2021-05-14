package cz.czechitas.java2webapps.ukol6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitatyService {

    private final NahodneCisloService cisloService;
    private final CitatyRepository citatyRepository;

    @Autowired
    public CitatyService(NahodneCisloService cisloService, CitatyRepository citatyRepository) {
        this.cisloService = cisloService;
        this.citatyRepository = citatyRepository;
    }

    public String nahodnyCitat() {
        return citatyRepository.citat(cisloService.dejNahodneCislo(citatyRepository.pocet()));
    }

    public String konkretniCitat(int cislo) {
        return citatyRepository.citat(cislo);
    }
}
