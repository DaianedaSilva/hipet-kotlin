package com.ddl.hipet.infrastructure

class CriarUsuarioException(
        private val mensagem: String
): Exception(mensagem)