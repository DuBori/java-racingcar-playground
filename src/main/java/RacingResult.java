public class RacingResult {
    private String name;
    private String msg;

    public RacingResult() {
    }

    public RacingResult(String name, String string) {
        this.name = name;
        this.msg = string;
    }

    public static RacingResult empty() {
        return new RacingResult();
    }

    public String getMsg() {
        return msg;
    }

    public void printRacingMsg() {
        System.out.println(name + "가 최종 우승했습니다.");
    }
}
