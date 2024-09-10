package hw2.task2;

import lombok.Data;

@Data
public abstract class PC {
    private String processor;
    private int RAM;
    private String videoCard;
    private int diskStorage;

    public PC(String processor, int RAM, String videoCard, int diskStorage) {
        this.processor = processor;
        this.RAM = RAM;
        this.videoCard = videoCard;
        this.diskStorage = diskStorage;
    }

    public PC(){}

}
