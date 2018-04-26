package com.mayweather.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParsController {

    private Map parser = new HashMap<String, TreeMap<Integer, String>>();

    @SuppressWarnings("all fine")
    public void insert(String word, Integer count, String url) {
        TreeMap<Object, Object> map = new TreeMap<>();
        map.put(count, url);
        parser.put(word, map);
    }

    @SuppressWarnings("working fine")
    public Map getParser() {
        return new TreeMap<>(parser);
    }

    public int count(String[] words, String word) {
        int counter = 0;
        for (String wrd : words) {
            if (wrd.equalsIgnoreCase(word)) {
                counter++;
            }
        }
        return counter;
    }

    public List<String> getPath(String path, String response, int numberOfUrls) {
        int counter = 0;
        if (response != null) {
            List<String> url = new ArrayList<>();
            Pattern pattern = Pattern.compile(("(?:href|src)=\"/World/Shekspir/([^\"]+).htm"));
            Matcher matcher = pattern.matcher(response);
            while (matcher.find()) {
                counter++;
                String fullPath = path +
                        "/" +
                        matcher.group().split("/")[3];
                url.add(fullPath.replaceAll(String.valueOf((char) 34), ""));
                if (counter == numberOfUrls) {
                    break;
                }
            }
            return url;
        } else {
            return null;
        }
    }

    public static String read(String path) throws IOException {
        URL url = new URL(path);
        URLConnection connection = url.openConnection();
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "Cp1251"));
        String str;
        StringBuilder builder = new StringBuilder();
        while ((str = reader.readLine()) != null)
            builder.append(str);
        return builder.toString();
    }

    public String[] getWords(String htmlPage) {
        htmlPage = htmlPage.replaceAll("<[^>]*>", "");
        return htmlPage.split("['\\w',':','/',',',' -']");
    }

    public String find(String[] words) {
        int max = 0;
        String word = null;
        int counter = 0;
        for (String word1 : words) {
            for (String word2 : words) {
                if (word1.equalsIgnoreCase(word2) && word1.length() > 3) {
                    counter++;
                }
            }
            if (counter > max) {
                max = counter;
                word = word1;
            }
            counter = 0;
        }
        return word + ":" + max;
    }
}

