package OptionalClass;

import java.util.Optional;

public class sinceJava8 {

	public static void main(String[] args) {
		Optional<People> peOptional = Optional.ofNullable(null);
		peOptional.ifPresentOrElse(p -> System.out.println(p.getName())
								   , () -> System.out.println("list is null!"));
	}

}
