/*!-----------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * monaco-css version: 2.1.1(a021ab7a38731f54509ae2a95507f8165728cd2f)
 * Released under the MIT license
 * https://github.com/Microsoft/monaco-css/blob/master/LICENSE.md
 *-----------------------------------------------------------------------------*/
define("vs/language/css/monaco.contribution",["require","exports"],function(o,e){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var t=monaco.Emitter,n=function(){function e(e,n){this._onDidChange=new t,this._languageId=e,this.setDiagnosticsOptions(n)}return Object.defineProperty(e.prototype,"onDidChange",{get:function(){return this._onDidChange.event},enumerable:!0,configurable:!0}),Object.defineProperty(e.prototype,"languageId",{get:function(){return this._languageId},enumerable:!0,configurable:!0}),Object.defineProperty(e.prototype,"diagnosticsOptions",{get:function(){return this._diagnosticsOptions},enumerable:!0,configurable:!0}),e.prototype.setDiagnosticsOptions=function(e){this._diagnosticsOptions=e||Object.create(null),this._onDidChange.fire(this)},e}(),i={validate:!0,lint:{compatibleVendorPrefixes:"ignore",vendorPrefix:"warning",duplicateProperties:"warning",emptyRules:"warning",importStatement:"ignore",boxModel:"ignore",universalSelector:"ignore",zeroUnits:"ignore",fontFaceProperties:"warning",hexColorLength:"error",argumentsInColorFunction:"error",unknownProperties:"warning",ieHack:"ignore",unknownVendorSpecificProperties:"ignore",propertyIgnoredDueToDisplay:"warning",important:"ignore",float:"ignore",idSelector:"ignore"}},r=new(e.LanguageServiceDefaultsImpl=n)("css",i),s=new n("scss",i),a=new n("less",i);function u(){return monaco.Promise.wrap(new Promise(function(e,n){o(["./cssMode"],e,n)}))}monaco.languages.css={cssDefaults:r,lessDefaults:a,scssDefaults:s},monaco.languages.onLanguage("less",function(){u().then(function(e){return e.setupMode(a)})}),monaco.languages.onLanguage("scss",function(){u().then(function(e){return e.setupMode(s)})}),monaco.languages.onLanguage("css",function(){u().then(function(e){return e.setupMode(r)})})});