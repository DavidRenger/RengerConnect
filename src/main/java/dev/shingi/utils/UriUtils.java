package dev.shingi.utils;

public class UriUtils {

    private String skip = "";
    private String top = "";
    private String filter = "";

    private StringBuilder uriExtension;

    public UriUtils(String endpoint, String skip, String top, String filter) {
        this.skip = skip;
        this.top = top;
        this.filter = filter;
    }

    public String getUriExtension(String endpoint) {
        uriExtension = new StringBuilder();

        uriExtension.append(endpoint);
        
        uriExtension.append(skip);
        uriExtension.append(top);
        uriExtension.append(filter);

        return uriExtension.toString();
    }
}