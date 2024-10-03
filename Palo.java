public abstract class Palo {
    public abstract String getNombre();
}
public class Trebol extends Palo {
    @Override
    public String getNombre() {
        return "Trebol";
    }
}

public class Diamante extends Palo {
    @Override
    public String getNombre() {
        return "Diamante";
    }
}

public class Pica extends Palo {
    @Override
    public String getNombre() {
        return "Pica";
    }
}

public class Corazon extends Palo {
    @Override
    public String getNombre() {
        return "Corazón";
    }
}
