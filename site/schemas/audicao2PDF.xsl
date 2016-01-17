<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:fo="http://www.w3.org/1999/XSL/Format"
    version="2.0">


    <xsl:template match="/">
        <fo:root>
            <fo:layout-master-set>
                <fo:simple-page-master master-name="lista" page-height="210mm" page-width="297mm">
                    <fo:region-body region-name="corpo" margin="2cm"/>
                </fo:simple-page-master>
            </fo:layout-master-set>
            <xsl:apply-templates/>
        </fo:root>
    </xsl:template>


    <xsl:template match="audicao">
        <fo:page-sequence master-reference="lista">
            <fo:flow flow-name="corpo" font-size="13pt">
                <fo:table>
                    <fo:table-body>
                        <fo:table-row>
                            <fo:table-cell>
                                <fo:block>
                                    <fo:external-graphic src="New_Doritos_Logo.png"
                                        content-height="scale-to-fit" height="5cm"
                                        content-width="5cm" scaling="non-uniform"/>
                                </fo:block>
                            </fo:table-cell>
                            <fo:table-cell width="160mm">
                                <fo:block font-size="55pt">
                                    <xsl:value-of select="@id"/>
                                </fo:block>
                                <fo:block font-size="23pt">
                                    <xsl:value-of select="metainfo/subtitulo"/>
                                </fo:block>
                                <fo:block>
                                    <xsl:value-of select="metainfo/tema"/>
                                </fo:block>
                            </fo:table-cell>
                        </fo:table-row>
                    </fo:table-body>
                </fo:table>
                <fo:block-container alignment-adjust="center">
                    <fo:block text-align="center" background-color="#ffdd99" font-size="18pt" padding-top="2mm" padding-bottom="2mm">
                        <fo:inline space-start="1cm" space-end="1cm" font-weight="bold">
                            <fo:inline font-size="9pt">data:</fo:inline>
                            <xsl:value-of select="metainfo/data"/>
                        </fo:inline> | 
                        <fo:inline space-start="1cm" space-end="1cm" font-weight="bold">
                            <fo:inline font-size="9pt">hora:</fo:inline>
                            <xsl:value-of select="metainfo/hora"/>
                        </fo:inline> | 
                        <fo:inline space-start="1cm" space-end="1cm" font-weight="bold">
                            <fo:inline font-size="9pt">local:</fo:inline>
                            <xsl:value-of select="metainfo/local"/>
                        </fo:inline>
                    </fo:block>
                </fo:block-container>

                <xsl:apply-templates/>

            </fo:flow>
        </fo:page-sequence>
    </xsl:template>




    <xsl:template match="atuacoes">
        <fo:block-container>
            <xsl:apply-templates/>
        </fo:block-container>
    </xsl:template>

    <xsl:template match="atuacao">
        <fo:block font-size="16pt" font-weight="bold" padding-top="4mm">
            <xsl:value-of select="hora_inicio"/>
        </fo:block>
        <fo:block>
            <xsl:apply-templates select="obras"/>
            <xsl:apply-templates select="musicos"/>
        </fo:block>
    </xsl:template>

    <xsl:template match="obras">
        <xsl:apply-templates/>
    </xsl:template>
    <xsl:template match="obra">
        <fo:inline space-start="1mm" space-after="1mm" background-color="#a3c2c2">
            <xsl:value-of select="nome"/>
        </fo:inline>
    </xsl:template>
    <xsl:template match="musicos">
        <fo:block>
            <xsl:apply-templates/>
        </fo:block>
    </xsl:template>

    <xsl:template match="musico">
        <fo:inline space-start="1mm" font-size="16pt" font-weight="bold">
            <xsl:value-of select="nome"/>
        </fo:inline>
        <fo:inline space-start="1mm" font-size="11pt">
            <xsl:value-of select="instrumento"/>
        </fo:inline>
    </xsl:template>



    <xsl:template match="*"/>







</xsl:stylesheet>
