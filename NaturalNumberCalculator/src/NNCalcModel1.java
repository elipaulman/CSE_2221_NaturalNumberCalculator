import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumber2;

/**
 * Model class.
 *
 * @author Elijah Paulman
 */
public final class NNCalcModel1 implements NNCalcModel {

    /**
     * Model variables.
     */
    private final NaturalNumber top, bottom;

    /**
     * No argument constructor.
     */
    public NNCalcModel1() {
        // Initializes top and bottom NaturalNumber objects to zero
        this.top = new NaturalNumber2();
        this.bottom = new NaturalNumber2();
    }

    @Override
    public NaturalNumber top() {
        // Returns top operand of calculator model
        return this.top;
    }

    @Override
    public NaturalNumber bottom() {
        // Returns bottom operand of calculator model
        return this.bottom;
    }

}
