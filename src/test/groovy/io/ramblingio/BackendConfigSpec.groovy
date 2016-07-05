import io.ramblingio.RamblingConfig
import org.springframework.boot.test.SpringApplicationConfiguration
import spock.lang.Specification

@SpringApplicationConfiguration(classes = RamblingConfig.class)
class BackendConfigSpec extends Specification {


    def "Manages to start up"() {
        given:
            def multiplier = { it * it }
        when:
            def sum = multiplier.call(4)
        then:
            sum == 16
    }

}