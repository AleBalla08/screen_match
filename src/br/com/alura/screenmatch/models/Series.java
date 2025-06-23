package br.com.alura.screenmatch.models;

public class Series extends Title{
    private int Seasons;
    private boolean active;
    private int episodesPerSeason;
    private int minutesPerEpisode;

    public boolean isActive() {e
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getSeasons() {
        return Seasons;
    }

    public void setSeasons(int seasons) {
        Seasons = seasons;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }
}
