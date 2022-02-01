import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Bar<T> {
    private final @NotNull T value;

    public Bar(@NotNull T value) {
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