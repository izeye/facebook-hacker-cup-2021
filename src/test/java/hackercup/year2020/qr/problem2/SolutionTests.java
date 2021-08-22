package hackercup.year2020.qr.problem2;

import hackercup.AbstractSolutionTests;
import org.junit.jupiter.api.Disabled;

import java.io.IOException;

/**
 * Tests for {@link Solution}.
 *
 * @author Johnny Lim
 */
class SolutionTests extends AbstractSolutionTests {

    @Override
    protected void doTest() {
        Solution.main(new String[0]);
    }

    @Disabled("This takes too long.")
    @Override
    protected void runAgainstFullGrading() throws IOException {
        super.runAgainstFullGrading();
    }

}
