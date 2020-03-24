package fr.norsys.technomaker.demohibernate.simple;

import java.util.ArrayList;

public class Formation {

    private Long id;
    private String theme;
    private ArrayList<Participant> participants;

    public Formation(String theme) {
        super();
        this.theme = theme;
        this.participants = null;
    }

    public Formation() {
        super();
    }

    public void setParticipants(ArrayList<Participant> participants) {
        this.participants = new ArrayList<>();
        this.participants = participants;
    }

    public ArrayList<Participant> getParticipants() {
        return participants;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Override
    public String toString() {
        return "Formation{" +
                "id=" + id +
                ", theme='" + theme + '\'' +
                ", participants=" + participants +
                '}';
    }
}
