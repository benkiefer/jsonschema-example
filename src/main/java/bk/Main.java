package bk;

import bk.model.Car;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.JsonSchemaGenerator;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper m = new ObjectMapper();

        JsonSchemaGenerator generator = new JsonSchemaGenerator(m);
        JsonSchema jsonSchema = generator.generateSchema(Car.class);

        String json = m.writerWithDefaultPrettyPrinter().writeValueAsString(jsonSchema);
        System.out.println(json);
    }
}
