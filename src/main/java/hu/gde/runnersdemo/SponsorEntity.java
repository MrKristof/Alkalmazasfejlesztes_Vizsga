package hu.gde.runnersdemo;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

public class SponsorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long sponsorID;
    private String sponsorName;

    @OneToMany(mappedBy = "sponsor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RunnerEntity> runners = new ArrayList<>();

    public long getSponsorID() {
        return sponsorID;
    }

    public void setSponsorID(long sponsorID) {
        this.sponsorID = sponsorID;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    public List<RunnerEntity> getRunners() {
        return runners;
    }
}
