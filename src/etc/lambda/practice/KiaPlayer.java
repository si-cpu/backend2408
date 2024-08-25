package etc.lambda.practice;

import java.util.Objects;

public class KiaPlayer {

    private String name; //이름
    private String BackNumber; //등번호
    private String position; //포지션

    public KiaPlayer(final String name, final String backNumber, final String position) {
        this.name = name;
        this.BackNumber = backNumber;
        this.position = position;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (null == o || this.getClass() != o.getClass()) return false;
        final KiaPlayer kiaPlayer = (KiaPlayer) o;
        return Objects.equals(this.name, kiaPlayer.name) && Objects.equals(this.BackNumber, kiaPlayer.BackNumber) && Objects.equals(this.position, kiaPlayer.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.BackNumber, this.position);
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getBackNumber() {
        return this.BackNumber;
    }

    public void setBackNumber(final String backNumber) {
        this.BackNumber = backNumber;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(final String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "KiaPlayer{" +
                "name='" + name + '\'' +
                ", BackNumber='" + BackNumber + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}

