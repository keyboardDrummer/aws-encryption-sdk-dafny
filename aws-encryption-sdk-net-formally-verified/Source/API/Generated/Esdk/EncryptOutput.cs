// Copyright Amazon.com Inc. or its affiliates. All Rights Reserved.
// SPDX-License-Identifier: Apache-2.0

using System;
using Aws.Crypto;
using
    Aws.Esdk
    ;

namespace Aws.Esdk
{
    public class EncryptOutput
    {
        private System.IO.MemoryStream _ciphertext;
        private System.Collections.Generic.Dictionary<string, string> _encryptionContext;
        private Aws.Crypto.AlgorithmSuiteId _algorithmSuiteId;

        public System.IO.MemoryStream Ciphertext
        {
            get { return this._ciphertext; }
            set { this._ciphertext = value; }
        }

        public System.Collections.Generic.Dictionary<string, string> EncryptionContext
        {
            get { return this._encryptionContext; }
            set { this._encryptionContext = value; }
        }

        public Aws.Crypto.AlgorithmSuiteId AlgorithmSuiteId
        {
            get { return this._algorithmSuiteId; }
            set { this._algorithmSuiteId = value; }
        }

        public void Validate()
        {
        }
    }
}
