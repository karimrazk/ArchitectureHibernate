package com.technomaker.demohibernate.simple;

public class Formation {

    // attributs, getters, setters et constructeur

    private Long id;
    private String theme;

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

    // Constructeur
    public Formation(String theme) {
        super();
        this.theme = theme;
    }

    // Constructeur par defaut
    public Formation() {
        super();
    }
}
