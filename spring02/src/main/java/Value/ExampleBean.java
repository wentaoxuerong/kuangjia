package Value;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**引用的方式注入集合类型
 * @time: 2018年02月25日
 * @author: wentao
 * @copyright: Wuxi Yazuo ,Ltd.copyright 2015-2025
 */
public class ExampleBean {
    private List<String> interest;
    private Set<String> city;
    private Map<String,Double> score;
    private Properties db;

    public ExampleBean() {
        System.out.println("ExampleBean()");
    }

    @Override
    public String toString() {
        return "ExampleBean{" +
                "interest=" + interest +
                ", city=" + city +
                ", score=" + score +
                ", db=" + db +
                '}';
    }

    public List<String> getInterest() {
        return interest;
    }

    public void setInterest(List<String> interest) {
        this.interest = interest;
    }

    public Set<String> getCity() {
        return city;
    }

    public void setCity(Set<String> city) {
        this.city = city;
    }

    public Map<String, Double> getScore() {
        return score;
    }

    public void setScore(Map<String, Double> score) {
        this.score = score;
    }

    public Properties getDb() {
        return db;
    }

    public void setDb(Properties db) {
        this.db = db;
    }
}
