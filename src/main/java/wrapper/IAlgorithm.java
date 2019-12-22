package wrapper;

import org.json.JSONArray;
import org.json.JSONObject;

public interface IAlgorithm {
    void Init(JSONObject args);

    JSONObject Start(JSONArray input) throws Exception;

    void Stop();

    void Cleanup();

    void StartSubPipeLine(String subPipeName, String id, Object message);

    void SubPipelineDone(String subId, Object data);
}
