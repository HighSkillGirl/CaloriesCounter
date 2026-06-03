package high.skill.girl.project.calories_counter.dto;

import io.micronaut.context.annotation.Prototype;
import io.micronaut.core.type.Argument;
import io.micronaut.serde.Encoder;
import io.micronaut.serde.ObjectSerializer;
import io.micronaut.serde.Serializer;
import io.micronaut.serde.exceptions.SerdeException;
import io.micronaut.serde.util.GeneratedSerdeExceptionUtil;
import io.micronaut.serde.util.GeneratedSerdeFallbackUtil;
import java.io.IOException;
import java.lang.String;
import java.lang.Throwable;
import javax.annotation.processing.Generated;

@Prototype
@Generated("Micronaut")
public final class SerdeProductDtoSerializer implements Serializer<ProductDto>, ObjectSerializer<ProductDto> {
  private static final String KEY_0 = "name";

  private static final Argument ARGUMENT_0 = Argument.STRING.withName(SerdeProductDtoSerializer.KEY_0);

  private static final String KEY_1 = "proteins";

  private static final Argument ARGUMENT_1 = Argument.FLOAT.withName(SerdeProductDtoSerializer.KEY_1);

  private static final String KEY_2 = "fats";

  private static final Argument ARGUMENT_2 = Argument.FLOAT.withName(SerdeProductDtoSerializer.KEY_2);

  private static final String KEY_3 = "carbohydrates";

  private static final Argument ARGUMENT_3 = Argument.FLOAT.withName(SerdeProductDtoSerializer.KEY_3);

  private static final String KEY_4 = "calories";

  private static final Argument ARGUMENT_4 = Argument.FLOAT.withName(SerdeProductDtoSerializer.KEY_4);

  public Serializer<ProductDto> createSpecific(Serializer.EncoderContext context, Argument<? extends ProductDto> type) throws SerdeException {
    return (Serializer<ProductDto>) GeneratedSerdeFallbackUtil.withRuntimeObjectFallback(this, context, type);
  }

  public void serialize(Encoder encoder, Serializer.EncoderContext context, Argument type, ProductDto value) throws IOException {
    Encoder objectEncoder = encoder.encodeObject(type);
    this.serializeInto(objectEncoder, context, type, value);
    objectEncoder.finishStructure();
  }

  public void serializeInto(Encoder encoder, Serializer.EncoderContext context, Argument type, ProductDto value) throws IOException {
    encoder.encodeKey(SerdeProductDtoSerializer.KEY_0);
    try {
      String value0 = value.name();
      if (value0 == null) {
        encoder.encodeNull();
      } else {
        encoder.encodeString(value0);
      }
    } catch (Throwable e0) {
      throw GeneratedSerdeExceptionUtil.withPropertyPath(e0, type, SerdeProductDtoSerializer.ARGUMENT_0);
    }
    encoder.encodeKey(SerdeProductDtoSerializer.KEY_1);
    try {
      encoder.encodeFloat(value.proteins());
    } catch (Throwable e0) {
      throw GeneratedSerdeExceptionUtil.withPropertyPath(e0, type, SerdeProductDtoSerializer.ARGUMENT_1);
    }
    encoder.encodeKey(SerdeProductDtoSerializer.KEY_2);
    try {
      encoder.encodeFloat(value.fats());
    } catch (Throwable e0) {
      throw GeneratedSerdeExceptionUtil.withPropertyPath(e0, type, SerdeProductDtoSerializer.ARGUMENT_2);
    }
    encoder.encodeKey(SerdeProductDtoSerializer.KEY_3);
    try {
      encoder.encodeFloat(value.carbohydrates());
    } catch (Throwable e0) {
      throw GeneratedSerdeExceptionUtil.withPropertyPath(e0, type, SerdeProductDtoSerializer.ARGUMENT_3);
    }
    encoder.encodeKey(SerdeProductDtoSerializer.KEY_4);
    try {
      encoder.encodeFloat(value.calories());
    } catch (Throwable e0) {
      throw GeneratedSerdeExceptionUtil.withPropertyPath(e0, type, SerdeProductDtoSerializer.ARGUMENT_4);
    }
  }
}
