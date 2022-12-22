package proxy_pattern;

import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {
    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    private void drive() {
        Person joe = new PersonImpl();
        Person ownerProxy = getOwnerProxy(joe);
        System.out.println("ownerProxy = " + ownerProxy.getName());
        ownerProxy.setInterests("볼링");
        try {
            ownerProxy.setGeekRating(100);
        } catch (Exception e) {
            System.out.println("접근 실패");
        }
        System.out.println("ownerProxy = " + ownerProxy.getGeekRating());

        Person nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("nonOwnerProxy.getName() = " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("바둑");
        } catch (Exception e) {
            System.out.println("접근 실패2");
        }
        nonOwnerProxy.setGeekRating(100);
        System.out.println("nonOwnerProxy = " + nonOwnerProxy.getGeekRating());
    }

    private Person getOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person)
        );
    }

    private Person getNonOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person)
        );
    }
}
