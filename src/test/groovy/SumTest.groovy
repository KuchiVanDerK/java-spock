import spock.lang.Specification
import spock.lang.Unroll

class SumTest extends Specification {

    def "test sum"() {
        given:
        def sum = new Sum(2, 3)

        expect:
        sum.getSum() == 5
    }

    def "test sum using private method"() {
        expect:
        5 == Sum.sum(2, 3)
    }

    def "test sum manipulating internal state"() {
        given:
        def sum = new Sum(2, 3)

        and: 'manipulate internal state'
        sum.with {
            it.a = 7
            it.b = -7
            it
        }

        expect: 'to use new sate'
        sum.getSum() == 0
    }

    @Unroll
    def "test #description"() {
        expect:
        sum == Sum.sum(a, b)

        where:
        description     | a  | b  | sum
        'both positive' | 2  | 3  | 5
        'one negative'  | 2  | -1 | 1
        'both negative' | -2 | -3 | -5

    }

}
