package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    private Employer employer;

    @ManyToMany
    private List<Skill> skills;

    public Job() {
    }

    public Job(@NotBlank @Size(min = 1, max = 100, message = "Name must be between 1 and 100 characters") String name, Employer anEmployer, List<Skill> skills) {
        super();
        this.setName(name);
        this.employer = anEmployer;
        this.skills = skills;
    }

    // Getters and setters.

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills)
    {
        this.skills = skills;
    }
}
