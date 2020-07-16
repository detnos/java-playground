package com.galvanize.classes;

import com.galvanize.Interfaces.Browseable;

import java.net.URI;

class Crawler implements Browseable {
    URI uri;

    @Override
    public void visit(URI uri) {
        this.uri = uri;
    }

    @Override
    public URI getCurrentPage() {
        return uri;
    }
}
