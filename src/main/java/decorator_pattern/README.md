## 데코레이터 패턴(Decorator pattern)
* 객체에 추가 요소를 동적으로 더할 수 있다.
* 자식 클래스를 만드는 것보다 훨씬 유연하게 기능을 확장할 수 있다.
> ```java
> import java.io.*; 
> 
> class Example{
>   public static void main(String[] args) throws IOException{
>       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
>       BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
>   }
> }
> ```
> InputStreamReader 클래스는 Reader 추상 클래스를 상속하고 있다.<br>
> BufferedReader 클래스는 Reader 추상 클래스를 상속하고 있다.<br>
> 
> Reader 추상 클래스는 Critical Section으로 사용하기 위한 Object lock을 가지고 있다.<br>
> System.in을 InputStreamReader의 생성자에 넣어서 만들어진 InputStreamReader 인스턴스를 또 한 번 BufferedReader로 감싸줘서 추가 기능을 사용할 수 있다.