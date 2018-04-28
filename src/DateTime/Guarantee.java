package DateTime;

import java.time.LocalDate;

public class Guarantee {
    LocalDate isValidUntil;

    public Guarantee(LocalDate isValidUntil) {
        this.isValidUntil = isValidUntil;
    }

    public Guarantee() {
    }

    public LocalDate getIsValidUntil() {
        return isValidUntil;
    }

    public void setIsValidUntil(LocalDate isValidUntil) {
        this.isValidUntil = isValidUntil;
    }
}
