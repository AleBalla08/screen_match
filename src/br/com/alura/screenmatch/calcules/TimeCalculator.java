package br.com.alura.screenmatch.calcules;
import br.com.alura.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void includes(Title t) {
        this.totalTime += t.getInMinutesDuration();
    }
}
