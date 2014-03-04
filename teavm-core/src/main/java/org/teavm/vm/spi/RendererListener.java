/*
 *  Copyright 2014 Alexey Andreev.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.teavm.vm.spi;

import java.io.IOException;
import org.teavm.javascript.RenderingContext;
import org.teavm.model.ClassReader;
import org.teavm.vm.BuildTarget;

/**
 *
 * @author Alexey Andreev <konsoletyper@gmail.com>
 */
public interface RendererListener {
    void begin(RenderingContext context, BuildTarget buildTarget) throws IOException;

    void beforeClass(ClassReader cls) throws IOException;

    void afterClass(ClassReader cls) throws IOException;

    void complete() throws IOException;
}
