import org.jetbrains.annotations.NotNull;

import java.util.List;

public class TestModuleBar<T> {
    private final @NotNull T value;

    public TestModuleBar(@NotNull T value) {
        this.value = value;
    }

    public @NotNull T getValue() {
        return value;
    }

    public void foo(@NotNull T x) {
    }

    public void foo(List<@NotNull T> x) {
    }
}

