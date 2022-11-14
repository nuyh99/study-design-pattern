## 커맨드 패턴(Command Pattern)
* 요청 내역을 객체로 캡슐화해서 사용할 수 있다.
* 요청을 큐에 저장하거나 로그로 기록, 작업 취소 기능을 사용할 수 있다.
> Command 인터페이스 execute(), undo()<br>
> 클라이언트는 setCommand()를 사용해서 요청 내역을 매개변수로 참조할 수 있다.<br>
> CommandImpl은 excute(), undo()를 구현해두고 Receiver가 일을 처리한다.