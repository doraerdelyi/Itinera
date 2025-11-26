public class JsonDeserializer<T> implements Deserializer<T> {
    private final ObjectMapper objectMapper = new ObjectMapper();
    private Class<T> type;


    public JsonDeserializer(Class<T> type) {
        this.type = type;
    }


    @Override
    public T deserialize(String topic, byte[] data) {
        try {
            return objectMapper.readValue(data, type);
        } catch (Exception e) {
            throw new RuntimeException("Error deserializing JSON message", e);
        }
    }
}