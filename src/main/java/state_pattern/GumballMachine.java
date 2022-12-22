package state_pattern;

public class GumballMachine {
    final static int SOLD_OUT=0;
    final static int NO_QUARTER=1;
    final static int HAS_QUARTER=2;
    final static int SOLD=3;

    int state = SOLD_OUT;
    int count=0;

    public GumballMachine(int count) {
        this.count = count;
        if(count>0)
            state = NO_QUARTER;
    }

    public void insertQuarter() {
        if(state==HAS_QUARTER)
            System.out.println("동전은 한 개만 넣어 주세요.");
        if(state==NO_QUARTER) {
            System.out.println("동전을 넣으셨습니다.");
            state = HAS_QUARTER;
        }
        if(state==SOLD_OUT)
            System.out.println("매진됐습니다. 다음 기회에 이용해 주세요.");
        if(state==SOLD)
            System.out.println("알맹이를 내보내고 있습니다.");
    }
}
