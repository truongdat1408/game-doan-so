package model;

public enum UrlName {
    HOME("index.jsp"),
    GAME("game.jsp"),
    CHART("chart.jsp");

    private String value;

    UrlName(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
