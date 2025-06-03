package store.order;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder @Accessors(fluent = true)
public record ProductOut(
        String id,
        String name,
        Double price,
        String unit
) {
}