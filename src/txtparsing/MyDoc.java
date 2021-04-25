package txtparsing;

/**
 *
 * @author Tonia Kyriakopoulou
 */
public class MyDoc {

    private String id;
    private String body;

    public MyDoc(String id, String body) {
        this.id = id;
        this.body = body;
    }

    @Override
    public String toString() {
        String ret = "MyDoc{"
                + "\n\tID: " + id
                + "\n\tBody: " + body;
        return ret + "\n}";
    }

    //---- Getters & Setters definition ----

    public String getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
