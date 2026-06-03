package high.skill.girl.project.calories_counter.dto;

import io.micronaut.context.annotation.Parameter;
import io.micronaut.context.annotation.Prototype;
import io.micronaut.core.type.Argument;
import io.micronaut.serde.Decoder;
import io.micronaut.serde.Deserializer;
import io.micronaut.serde.exceptions.SerdeException;
import io.micronaut.serde.util.GeneratedSerdeExceptionUtil;
import io.micronaut.serde.util.GeneratedSerdeFallbackUtil;
import java.io.IOException;
import java.lang.String;
import javax.annotation.processing.Generated;

@Prototype
@Generated("Micronaut")
public final class SerdeProductDtoDeserializer implements Deserializer<ProductDto> {
  private static final String KEY_0 = "name";

  private static final Argument ARGUMENT_0 = Argument.STRING.withName(SerdeProductDtoDeserializer.KEY_0);

  private static final String KEY_1 = "proteins";

  private static final Argument ARGUMENT_1 = Argument.FLOAT.withName(SerdeProductDtoDeserializer.KEY_1);

  private static final String KEY_2 = "fats";

  private static final Argument ARGUMENT_2 = Argument.FLOAT.withName(SerdeProductDtoDeserializer.KEY_2);

  private static final String KEY_3 = "carbohydrates";

  private static final Argument ARGUMENT_3 = Argument.FLOAT.withName(SerdeProductDtoDeserializer.KEY_3);

  private static final String KEY_4 = "calories";

  private static final Argument ARGUMENT_4 = Argument.FLOAT.withName(SerdeProductDtoDeserializer.KEY_4);

  private final boolean failOnNullForPrimitives;

  private final boolean ignoreUnknown;

  public SerdeProductDtoDeserializer(@Parameter Deserializer.DecoderContext context, @Parameter Argument type) throws SerdeException {
    this.failOnNullForPrimitives = GeneratedSerdeExceptionUtil.failOnNullForPrimitives(context);
    this.ignoreUnknown = GeneratedSerdeExceptionUtil.ignoreUnknown(context);
  }

  public Deserializer<ProductDto> createSpecific(Deserializer.DecoderContext context, Argument type) throws SerdeException {
    return (Deserializer<ProductDto>) GeneratedSerdeFallbackUtil.withRuntimeObjectFallback(this, context, type);
  }

  public ProductDto deserialize(Decoder decoder, Deserializer.DecoderContext context, Argument type) throws IOException {
    Decoder objectDecoder = decoder.decodeObject(type);
    boolean seenProperty0 = false;
    boolean seenProperty1 = false;
    boolean seenProperty2 = false;
    boolean seenProperty3 = false;
    boolean seenProperty4 = false;
    String propertyValue0 = null;
    float propertyValue1 = 0.0f;
    float propertyValue2 = 0.0f;
    float propertyValue3 = 0.0f;
    float propertyValue4 = 0.0f;
    while (true) {
      String key = objectDecoder.decodeKey();
      if (key == null) {
        objectDecoder.finishStructure();
        return new high.skill.girl.project.calories_counter.dto.ProductDto(propertyValue0, propertyValue1, propertyValue2, propertyValue3, propertyValue4);
      }
      GeneratedSerdeExceptionUtil.PropertyDispatchResult propertyDispatchResult = switch (key) {
        case "name" -> {
          io.micronaut.serde.util.GeneratedSerdeExceptionUtil.PropertyDispatchResult dispatchResult = io.micronaut.serde.util.GeneratedSerdeExceptionUtil.PropertyDispatchResult.HANDLED;
          if (seenProperty0) {
            dispatchResult = io.micronaut.serde.util.GeneratedSerdeExceptionUtil.PropertyDispatchResult.DUPLICATE;
          } else {
            seenProperty0 = true;
            try {
              propertyValue0 = objectDecoder.decodeStringNullable();
            } catch (java.lang.Throwable e0) {
              throw io.micronaut.serde.util.GeneratedSerdeExceptionUtil.withPropertyPath(e0, type, high.skill.girl.project.calories_counter.dto.SerdeProductDtoDeserializer.ARGUMENT_0);
            }
          }
          yield dispatchResult;
        }
        case "proteins" -> {
          io.micronaut.serde.util.GeneratedSerdeExceptionUtil.PropertyDispatchResult dispatchResult = io.micronaut.serde.util.GeneratedSerdeExceptionUtil.PropertyDispatchResult.HANDLED;
          if (seenProperty1) {
            dispatchResult = io.micronaut.serde.util.GeneratedSerdeExceptionUtil.PropertyDispatchResult.DUPLICATE;
          } else {
            seenProperty1 = true;
            try {
              if (this.failOnNullForPrimitives) {
                java.lang.Float decodedValue1 = objectDecoder.decodeFloatNullable();
                if (decodedValue1 == null) {
                  dispatchResult = io.micronaut.serde.util.GeneratedSerdeExceptionUtil.PropertyDispatchResult.NULL;
                } else {
                  propertyValue1 = decodedValue1;
                }
              } else {
                if (objectDecoder.decodeNull()) {
                } else {
                  propertyValue1 = objectDecoder.decodeFloat();
                }
              }
            } catch (java.lang.Throwable e0) {
              throw io.micronaut.serde.util.GeneratedSerdeExceptionUtil.withPropertyPath(e0, type, high.skill.girl.project.calories_counter.dto.SerdeProductDtoDeserializer.ARGUMENT_1);
            }
          }
          yield dispatchResult;
        }
        case "fats" -> {
          io.micronaut.serde.util.GeneratedSerdeExceptionUtil.PropertyDispatchResult dispatchResult = io.micronaut.serde.util.GeneratedSerdeExceptionUtil.PropertyDispatchResult.HANDLED;
          if (seenProperty2) {
            dispatchResult = io.micronaut.serde.util.GeneratedSerdeExceptionUtil.PropertyDispatchResult.DUPLICATE;
          } else {
            seenProperty2 = true;
            try {
              if (this.failOnNullForPrimitives) {
                java.lang.Float decodedValue2 = objectDecoder.decodeFloatNullable();
                if (decodedValue2 == null) {
                  dispatchResult = io.micronaut.serde.util.GeneratedSerdeExceptionUtil.PropertyDispatchResult.NULL;
                } else {
                  propertyValue2 = decodedValue2;
                }
              } else {
                if (objectDecoder.decodeNull()) {
                } else {
                  propertyValue2 = objectDecoder.decodeFloat();
                }
              }
            } catch (java.lang.Throwable e0) {
              throw io.micronaut.serde.util.GeneratedSerdeExceptionUtil.withPropertyPath(e0, type, high.skill.girl.project.calories_counter.dto.SerdeProductDtoDeserializer.ARGUMENT_2);
            }
          }
          yield dispatchResult;
        }
        case "carbohydrates" -> {
          io.micronaut.serde.util.GeneratedSerdeExceptionUtil.PropertyDispatchResult dispatchResult = io.micronaut.serde.util.GeneratedSerdeExceptionUtil.PropertyDispatchResult.HANDLED;
          if (seenProperty3) {
            dispatchResult = io.micronaut.serde.util.GeneratedSerdeExceptionUtil.PropertyDispatchResult.DUPLICATE;
          } else {
            seenProperty3 = true;
            try {
              if (this.failOnNullForPrimitives) {
                java.lang.Float decodedValue3 = objectDecoder.decodeFloatNullable();
                if (decodedValue3 == null) {
                  dispatchResult = io.micronaut.serde.util.GeneratedSerdeExceptionUtil.PropertyDispatchResult.NULL;
                } else {
                  propertyValue3 = decodedValue3;
                }
              } else {
                if (objectDecoder.decodeNull()) {
                } else {
                  propertyValue3 = objectDecoder.decodeFloat();
                }
              }
            } catch (java.lang.Throwable e0) {
              throw io.micronaut.serde.util.GeneratedSerdeExceptionUtil.withPropertyPath(e0, type, high.skill.girl.project.calories_counter.dto.SerdeProductDtoDeserializer.ARGUMENT_3);
            }
          }
          yield dispatchResult;
        }
        case "calories" -> {
          io.micronaut.serde.util.GeneratedSerdeExceptionUtil.PropertyDispatchResult dispatchResult = io.micronaut.serde.util.GeneratedSerdeExceptionUtil.PropertyDispatchResult.HANDLED;
          if (seenProperty4) {
            dispatchResult = io.micronaut.serde.util.GeneratedSerdeExceptionUtil.PropertyDispatchResult.DUPLICATE;
          } else {
            seenProperty4 = true;
            try {
              if (this.failOnNullForPrimitives) {
                java.lang.Float decodedValue4 = objectDecoder.decodeFloatNullable();
                if (decodedValue4 == null) {
                  dispatchResult = io.micronaut.serde.util.GeneratedSerdeExceptionUtil.PropertyDispatchResult.NULL;
                } else {
                  propertyValue4 = decodedValue4;
                }
              } else {
                if (objectDecoder.decodeNull()) {
                } else {
                  propertyValue4 = objectDecoder.decodeFloat();
                }
              }
            } catch (java.lang.Throwable e0) {
              throw io.micronaut.serde.util.GeneratedSerdeExceptionUtil.withPropertyPath(e0, type, high.skill.girl.project.calories_counter.dto.SerdeProductDtoDeserializer.ARGUMENT_4);
            }
          }
          yield dispatchResult;
        }
        default -> GeneratedSerdeExceptionUtil.PropertyDispatchResult.UNKNOWN;
      };
      switch (propertyDispatchResult) {
        case GeneratedSerdeExceptionUtil.PropertyDispatchResult.NULL -> {
          throw GeneratedSerdeExceptionUtil.withPropertyPath(GeneratedSerdeExceptionUtil.nullValue(type, Argument.OBJECT_ARGUMENT.withName(key)), type, Argument.OBJECT_ARGUMENT.withName(key));
        }
        case GeneratedSerdeExceptionUtil.PropertyDispatchResult.UNKNOWN -> {
          if (this.ignoreUnknown) {
            objectDecoder.skipValue();
          } else {
            throw GeneratedSerdeExceptionUtil.unknownProperty(type, Argument.OBJECT_ARGUMENT.withName(key));
          }
        }
        case GeneratedSerdeExceptionUtil.PropertyDispatchResult.DUPLICATE -> {
          throw GeneratedSerdeExceptionUtil.duplicateProperty(type, Argument.OBJECT_ARGUMENT.withName(key));
        }
        case GeneratedSerdeExceptionUtil.PropertyDispatchResult.HANDLED -> {
        }
      }
    }
  }
}
